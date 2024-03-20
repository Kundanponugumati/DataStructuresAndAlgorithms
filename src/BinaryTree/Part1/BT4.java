package BinaryTree.Part1;

// diameter of a tree.
public class BT4 {

    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
         this.data = data;
         this.left=null;
         this.right=null;
        }
    }

    static class BinaryTree
    {
        public static int diameter(Node root)
        {
            if(root==null)
                return 0;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int selfDiameter = leftHeight+ rightHeight +1;
            return  Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));
        }

        public static int height(Node root)
        {
            if(root == null)
                return 0;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }

        // approach 02
        static class Info
        {
            static int diameter;
            static int height;
            public Info(int diameter,int height)
            {
                this.diameter = diameter;
                this.height = height;
            }

        }
        public static Info diameter2(Node root)
        {
            if(root==null)
            {
                return new Info(0,0);
            }
            Info  leftInfo = diameter2(root.left);
            Info  rightInfo = diameter2(root.right);
            int diameter = Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),leftInfo.height+rightInfo.height+1);
            int height = Math.max(leftInfo.height,rightInfo.height)+1;
            return new Info(diameter,height);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        BinaryTree tree = new BinaryTree();
//        System.out.println(tree.diameter(root));
        BinaryTree.Info obj = tree.diameter2(root);
        System.out.println(obj.diameter);
        System.out.println(obj.height);


    }
}
