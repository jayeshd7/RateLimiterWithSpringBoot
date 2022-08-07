package dto;


import lombok.Getter;

@Getter
public class AreaV1 {

    private String shape;
    private double area;

    public AreaV1(String shape, double area) {
        this.shape = shape;
        this.area = area;
    }
}
