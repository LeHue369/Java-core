package multi_thread.fork_join_pool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TreeNode {

    int value;

    Set<TreeNode> children;

    TreeNode(int value, TreeNode... children){
        this.value = value;
        this.children = Set.of(children);
    }
}
