package me.crazystone.study.tree;

/**
 * Created by crazystone on 18-2-1.
 */
public class TreeNode<E extends Comparable<E>> {

    public TreeNode<E> left;
    public TreeNode<E> right;
    public TreeNode<E> parent;
    public E e;

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

    public TreeNode<E> getParent() {
        return parent;
    }

    public TreeNode setParent(TreeNode<E> parent) {
        this.parent = parent;
        return this;
    }

}
