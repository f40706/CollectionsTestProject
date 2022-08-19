package collections.Set;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class SetItem2 implements Comparable<SetItem2> {
    private final String tag;

    public SetItem2(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    //檢查是否相同Object，再檢查是否是相同Class
    //最後檢查tag是否相同(此處可隨意變更)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetItem2 setItem2 = (SetItem2) o;
        return Objects.equals(tag, setItem2.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }

    @Override
    public int compareTo(@NotNull SetItem2 o) {
        if(this == o) return 0;
        return this.tag.compareTo(o.tag);
    }
}
