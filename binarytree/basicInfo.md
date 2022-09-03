## Tree Data structure :
    is the non-linear data structure.



              root                      : node which don't have any parent.
              node                   : data/info which we want to store.
              parent node            : immidate previous/predecious node. 
              immidate successor     : next node.
              leaf node              : have no child -> also called externall nodes
              non-leaf node         : which have at least one child -> also called internal nodes.
              path                  : its the sequence of congicutive edges from source to destination.
              Ancestor[purvaj]       : any predecessor node on the path from rooot to that node.
              decendant[pedi]       : any successor node on the path from that node to leaf node.

              what is common ancestor : a node where two different sub tree meet.


            Sibling : node which have same parent.
            degree  : no of child node.
            max degree of any node call the degree of tree.



            depth of a node : length of path from root to that node.[no of edges]

            Height of a node : no of edges in the longest path from that node to a leaf node.
            -> height of a tree is the height of the root node.

            Level of node : no of edges from root node to that node.




            Note :  -> level of a tree === to the height of a tree.
                    -> but level of a node != to the height of a tree.

            => if a tree have n no. of nodes then 
                (n-1) edges would be there.


Uses of tree :
    -> in file system
    -> in routing.
    



## Binary Tree :
    => Each node can have atmost 2 children.

    => max No. of node at any level = 2^i   //i-> level 
    => max No. of nodes of height h = 2^(h+1) -1
    => min -----------------------  = h+1
    












# Some preOrder traversal

    1. {1,2,4,8,-1,-1,9,-1,-1,5,10,-1,-1,11,-1,-1,3,6,12,-1,-1,13,-1,-1,7,14,-1,-1,15,-1,-1}
    2. {1,2,4,-1,-1,5,8,-1,-1,9,-1,-1,3,6,-1,-1,7,-1,-1}
    3. {1,2,4,-1,-1,5,6,-1,-1,7,-1,-1,3,-1,-1}
    4. {1,2,4,-1,-1,5,8,13,-1,-1,14,-1,-1,9,-1,-1,3,6,10,-1,-1,11,-1,-1,7,-1,12,-1,-1}
    5. {1,2,4,-1,-1,5,6,-1,-1,7,-1,-1,3,-1,-1}
    6. {1,2,4,-1,-1,-1,3,5,7,-1,-1,8,-1,-1,6,-1,-1}
    7. {1,2,-1,-1,3,-4,-1,-1,5,6,-1,-1,7,-1,-1}
    8. {1,2,-1,-1,3,4,6,-1,-1,7,-1,-1,5,-1,-1}
    9. {4,3,2,-1,-1,1,6,-1,-1,7,-1,-1,5,-1,-1}
    10. {4,7,-1,-1,6,-1,2,5,-1,-1,1,3,-1,-1,-1}
    11. {1,2,-1,4,7,10,-1,-1,-1,-1,3,-1,5,6,-1,8,-1,9,-1,-1}

    1) {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
    2) {4,5,1,-1,-1,-1,3,7,-1,-1,9,-1,-1}
    3) {3,4,-1,5,-1,-1,2,1,9,-1,-1,-1,7,-1,-1}
    4) {1,2,4,-1,-1,5,6,7,-1,-1,-1,-1,3,8,-1,-1,9,-1,10,-1,-1}
    5) {1,2,4,-1,-1,5,8,-1,-1,9,-1,-1,3,6,-1,-1,7,-1,-1};
    6) {4,8,-1,-1,9,-1,-1}
