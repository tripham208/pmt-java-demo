package vn.id.pmt.java.constain;

import lombok.Getter;

@Getter
public enum Season2 {
    SUMMER(2), FALL(1);
    private final int value;

    Season2(int value) {
        this.value = value;
    }
}
