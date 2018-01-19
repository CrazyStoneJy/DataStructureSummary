package study.crazystone.me.tree_update;

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
                parent.left = createTreeNode(e);
            } else if (parent.e.compareTo(e) < 0) {
                parent.right = createTreeNode(e);
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

    private static class TreeNode<E> {

        private TreeNode<E> left;
        private TreeNode<E> right;
        private E e;

        public TreeNode(E e) {
            this.e = e;
        }

        public TreeNode<E> getLeft() {
            return left;
        }

        public void setLeft(TreeNode<E> left) {
            this.left = left;
        }

        public TreeNode<E> getRight() {
            return right;
        }

        public void setRight(TreeNode<E> right) {
            this.right = right;
        }

        public E getE() {
            return e;
        }

        public void setE(E e) {
            this.e = e;
        }
    }


}
