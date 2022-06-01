package exercice2;

public class Builder {

    private Material mat;

    public void setMaterial(Material m){
        mat=m;
    }

    public void startBuilding(){
        mat.startBuilding();
    }

}
