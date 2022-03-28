public class BinarySearchTree <T extends Comparable>{
    private TNode<T> root;

    public int findHeight(){
        return findHeight();
    }

    public int findHeight(TNode<T> currentRoot){
        if (currentRoot!= null){
            int left = findHeight(currentRoot.left);
            int right = findHeight(currentRoot.right);
            return (left > right ? left+1 : right+1);
        }
        return 0;
    }

    public boolean search(T val){
        TNode<T> iterator = root;
        while (iterator!=null){
            if (iterator.value.compareTo(val)==0){
                return true;
            }else if(val.compareTo(iterator.value)==1){
                iterator = iterator.right;
            }else{
                iterator = iterator.left;
            }
        }
        return false;
    }

    public boolean searchRecursively(T val){
        return searchRecursively(root, val);
    }
    public boolean (TNode<T> currentRoot, T val){
        if (currentRoot==null){
            return false;
        }else if(val.compareTo(currentRoot.value)==-1){
            return searchRecursively(currentRoot.left, val);
        }else if(val.compareTo(currentRoot.value)==1){
            return searchRecursively(currentRoot.right, val);
        }else{
            return true;
        }
    }

    public void insert(T val){
        TNode<T> newNode = new TNode<>(val);
        if (root==null){
            root = newNode;
        }else{
            TNode<T> iterator = root;
            while (iterator!=null){
                if (val.compareTo(iterator.value)==-1){
                    if (iterator.left==null){
                        iterator.left = newNode;
                        return;
                    }else{
                        iterator = iterator.left;
                    }
                }else if(val.compareTo(iterator.value)==1){
                    if (iterator.right==null){
                        iterator.right = newNode;
                        return;
                    }else{
                        iterator = iterator.right;
                    }
                }else{
                    System.out.println("the same value exist");
                    return;
                }
            }
        }
    }
    public void inorder(){
        inorder(root);
        System.out.println();
    }
    public void inorder(TNode<T> currentRoot){
        if (currentRoot!=null){
            inorder(currentRoot.left);
            System.out.println(currentRoot.value);
            inorder(currentRoot.right);
        }
    }
}
