package lesson14;

import java.util.List;

public abstract class SomeTree {
    private List<Leaf> leafs;
    private String name;
    private TreeType treeType;

    public SomeTree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(List<Leaf> leafs) {
        this.leafs = leafs;
    }
}
