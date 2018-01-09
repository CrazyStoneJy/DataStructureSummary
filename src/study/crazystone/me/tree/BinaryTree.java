package com.crazystone.datastructure.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by crazystone on 2016/3/30.
 */
public class BinaryTree<E extends Comparable<E>> extends AbstractTree<E> {

    private TreeNode<E> root;
    private int size = 0;

    public BinaryTree(E[] array) {
        for (E e : array) {
            insert(e);
        }
    }

    public BinaryTree(List<E> list) {
        this((E[]) list.toArray());
    }

    public BinaryTree() {
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
            return true;
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (current.element.compareTo(e) < 0) {
                    parent = current;
                    current = current.right;
                } else if (current.element.compareTo(e) > 0) {
                    parent = current;
                    current = current.left;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else if (e.compareTo(parent.element) > 0) {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public boolean search(E e) {

        if (isEmpty()) return false;
        TreeNode current = root;
        while (current != null) {
            if (current.element.compareTo(e) < 0) {
                current = current.right;
            } else if (current.element.compareTo(e) > 0) {
                current = current.left;
            } else {
                return true;
            }
        }
        return false;
    }


    //i didn't konw this
    @Override
    public boolean delete(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                break;//找到了该元素element当前tree的位置
            }
        }

        if (current == null) return false;  //该tree中没有该元素

        //case1：current has no left child
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            //case2:the current node has a left child
            //Locate the rightmost node in the left subtree of
            //the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;//keep going to the right
            }

            current.element = rightMost.element;

            //Eliminate rightmost node
            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                //Special case: parentOfRightMost=current
                parentOfRightMost.left = rightMost.left;
            }
        }

        size--;
        return true;
    }

    @Override
    public void preOrder() {
        preOrder(root);
    }

    protected void preOrder(TreeNode<E> root) {
        if (root == null) return;
        System.out.print(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    @Override
    public void inOrder() {
        inOrder(root);
    }

    protected void inOrder(TreeNode<E> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.element + " ");
        inOrder(root.right);
    }


    @Override
    public void postOrder() {
        postOrder(root);
    }

    /* 二叉树的后序遍历（用递归的方法） */
    protected void postOrder(TreeNode<E> root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.element + " ");
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public void iterator() {
        inorderIterator();
    }

    /* 获取tree的最大深度 */
    public int height() {
        return height(root);
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(height(root.left), height(root.right));
    }


    /*  获取tree的所有叶子节点的个数*/
    public int getNumberOfLeaves() {
        return getNumberOfLeaves(root);
    }

    private int getNumberOfLeaves(TreeNode<E> root) {
        if (root == null) return 0;
        else if (root.left == null && root.right == null) return 1;
        else return getNumberOfLeaves(root.left) + getNumberOfLeaves(root.right);
    }

    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<E>(e);
    }

    public Iterator inorderIterator() {
        return new InorderIterator();
    }

    class TreeNode<E extends Comparable<E>> {
        TreeNode<E> left;
        TreeNode<E> right;
        E element;

        public TreeNode(E e) {
            this.element = e;
        }
    }


    class InorderIterator implements Iterator<E> {

        private List<E> list = new ArrayList<E>();

        private int index = 0;

        public InorderIterator() {
            inorder();
        }

        public void inorder() {
            inorder(root);
        }

        public void inorder(TreeNode<E> root) {
            if (root == null) return;
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
        }


        @Override
        public boolean hasNext() {
            if (index < list.size()) return true;
            return false;
        }

        @Override
        public E next() {
            return list.get(index++);
        }

        /**
         * Remove the current element and refresh the list
         */
        @Override
        public void remove() {
            delete(list.get(index));
            list.clear();
            inorder();
        }
    }


    /*  判断该二叉树是否是完全二叉树 */
    public boolean isFullBinaryTree() {

        return false;
    }

}
