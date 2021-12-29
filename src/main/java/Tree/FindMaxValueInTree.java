package Tree;

public class FindMaxValueInTree {

    static int findMax(TreeNode root) {
        /*
        jeśli gałąź nie ma odnóg to zwróć wartość gałęzi
        * Mam gałąź, gałąź ma dwie odnogi. Chce znaleźć która odnoga jest większa
        * Wiem która odnoga jest większa więc powinienem zwrócić jej wartość
        *
        *
        *
        * */
        if (root.left == null & root.right == null) return root.value;
        if (root.left == null) root.left.value = -2147483648;
        if (root.right == null) root.right.value = -2147483648;
        int max = Math.max(root.left.value, root.right.value);
        if (max == root.right.value) return findMax(root.right);
        return findMax(root.left);
    }
}
