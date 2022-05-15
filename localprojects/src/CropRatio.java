import java.util.HashMap;

public class CropRatio {
    private int totalWeight;
    private HashMap<String, Integer> crops = new HashMap<>();

    public void add(String name, int cropWeight) {
        Integer currentCropWeight = crops.get(name);
        if(currentCropWeight == null){
            crops.put(name, cropWeight);
        }else{
            crops.put(name, (crops.containsKey(name))?crops.get(name)+cropWeight:cropWeight);
        }
        totalWeight = totalWeight + cropWeight;
    }

    public double proportion(String name) {
        return totalWeight * crops.get(name)/100d;
    }

    public static void main(String[] args) {
        CropRatio cropRatio = new CropRatio();

        cropRatio.add("Wheat", 4);
        cropRatio.add("Wheat", 5);
        cropRatio.add("Rice", 1);

        System.out.println("Fraction of wheat: " + cropRatio.proportion("Wheat"));
    }
}
