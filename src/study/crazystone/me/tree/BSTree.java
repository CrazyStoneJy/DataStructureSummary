package study.crazystone.me.tree;

import study.crazystone.me.utils.Logs;

import java.util.LinkedList;
import java.util.Queue;

public class BSTree<E extends Comparable<E>> implements Tree<E> {

    private int size;
    private TreeNode<E> root;

    @Override
    public boolean insert(E e) {
        if (e == null) {
            return false;
        }
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        if (current == null) {
            root = createTreeNode(e);
            root.parent = null;
        } else {
            while (current != null) {
                if (e.compareTo(current.e) > 0) {
                    parent = current;
                    current = current.right;
                } else if (e.compareTo(current.e) < 0) {
                    parent = current;
                    current = current.left;
                } else {
                    throw new RuntimeException("can not insert same element in binary search tree");
                }
            }
            if (parent.e.compareTo(e) > 0) {
                TreeNode<E> leftNode = createTreeNode(e);
                parent.left = leftNode;
                leftNode.parent = parent;
            } else if (parent.e.compareTo(e) < 0) {
                TreeNode<E> rightNode = createTreeNode(e);
                parent.right = rightNode;
                rightNode.parent = parent;
            }
            size++;
            return true;
        }
        return false;
    }

    private TreeNode<E> createTreeNode(E e) {
        return new TreeNode<>(e);
    }


    @Override
    public boolean delete(E e) {
        if (e == null || root == null) return false;
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        //先去遍历查找tree中是否有该元素
        while (current != null) {
            if (current.e.compareTo(e) > 0) {
                parent = current;
                current = current.left;
            } else if (current.e.compareTo(e) < 0) {
                parent = current;
                current = current.right;
            } else {
                break;
            }
        }

        //根据情况来进行删除操作,分为case1:删除的元素没有左孩子;case2:删除的元素有左孩子
        if (current != null) {
            //case1:没有左孩子
            if (current.left == null) {
                //case1中包括两种情况:有右孩子;没有右孩子.因为没有左节点也没有右节点即为叶子节点,叶子节点的右孩子为null,将null赋值给父节点,可以融合为一个
                if (parent.e.compareTo(e) > 0) {
                    parent.left = current.right;
                } else if (parent.e.compareTo(e) < 0) {
                    parent.right = current.right;
                }
            } else {
                //同样case2有包含两种情况:有右孩子;没有右孩子.
                TreeNode<E> parentOfLeftMost = current;
                TreeNode<E> leftMost = current.left;
                //找到删除的节点左侧最大值
                while (leftMost.right != null) {
                    parentOfLeftMost = leftMost;
                    leftMost = leftMost.right;
                }
                //将左侧最大值赋予当前这个节点.这个操作是将值转换，为什么要这样做而不是将current节点删除?因为如果删除current节点,current节点联系的其他节点关系比较复杂,加入删除了current节点以后,其他节点的关系比较难处理,
                //因此,选择换值处理，从而减少了对其他节点关系的处理.
                current.e = leftMost.e;

                //todo 添加图来说明
                //如果parentOfLeftMost==current,
                if (leftMost == parentOfLeftMost.right) {
                    parentOfLeftMost.left = leftMost.left;
                } else {
                    parentOfLeftMost.right = leftMost.left;
                }
            }
            size--;
            return true;
        }

        return false;
    }


    @Override
    public boolean search(E e) {
        if (e == null || root == null) return false;
        TreeNode<E> current = root;
        while (current != null) {
            if (current.e.compareTo(e) > 0) {
                current = current.left;
            } else if (current.e.compareTo(e) < 0) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public TreeNode<E> get(E e) {
        if (e == null || root == null) return null;
        TreeNode<E> current = root;
        while (current != null) {
            if (current.e.compareTo(e) > 0) {
                current = current.left;
            } else if (current.e.compareTo(e) < 0) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public void preOrder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.e);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode<E> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.e);
        inOrder(root.right);
    }

    public void postOrder(TreeNode<E> root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.e);
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public int getMaxDeep() {
        TreeNode<E> current = root;
        return deep(current);
    }

    /**
     * 树的深度计算
     *
     * @param current
     * @return
     */
    private int deep(TreeNode<E> current) {
        if (current == null) return 0;
        int maxLeft = deep(current.left);
//        return maxLeft + 1;
        int maxRight = deep(current.right);
//        return maxRight + 1;
        return maxLeft >= maxRight ? maxLeft + 1 : maxRight + 1;
    }


    /**
     * 按层进行遍历
     */
    public void traversals() {
        TreeNode<E> current = root;
        Queue<TreeNode<E>> queue = new LinkedList<>();
        queue.offer(current);
        while (!queue.isEmpty()) {
            TreeNode<E> cur = queue.poll();
            Logs.l(cur.e);
            TreeNode<E> left = cur.getLeft();
            TreeNode<E> right = cur.getRight();
            if (left != null) {
                queue.offer(left);
            }
            if (right != null) {
                queue.offer(right);
            }
        }
    }


}
