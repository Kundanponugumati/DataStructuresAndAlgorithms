package BinaryTree.Part1;

public class BT3 {
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree
    {
        static int idx = -1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static int height(Node root)
        {
            if(root == null)
            {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int height = Math.max(leftHeight,rightHeight);
            return height+1;
        }
        public static int countNoOfNodes(Node root)
        {
            if(root==null)
                return 0;
            int leftCount = countNoOfNodes(root.left);
            int rightCount = countNoOfNodes(root.right);
            return leftCount+rightCount+1;
        }

        public static int sumOfNodes(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum+rightSum+root.data;
        }
    }

    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.height(root));
        System.out.println(tree.countNoOfNodes(root));
        System.out.println(tree.sumOfNodes(root));
    }
}
