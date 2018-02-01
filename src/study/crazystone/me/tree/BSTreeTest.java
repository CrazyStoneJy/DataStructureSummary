package study.crazystone.me.tree;

import study.crazystone.me.utils.Logs;

public class BSTreeTest {

    public static void main(String... args) {

        BSTree<Integer> tree = new BSTree<>();
        tree.insert(8);
        tree.insert(5);
        tree.insert(12);
        tree.insert(10);
        tree.insert(6);
        tree.insert(3);
        tree.insert(4);

//        tree.inOrder(tree.getRoot());
//        System.out.println(tree.delete(5));
//        System.out.println(">>>>>>>>>>>>>");
//        tree.inOrder(tree.getRoot());
//        System.out.println(tree.search(15));

        Logs.l(tree.getMaxDeep());
//        tree.traversals();
//        TreeNode<Integer> node = tree.get(12);
//        Logs.l(node.e);
//        Logs.l(node.parent.e);




    }


}