package OOP.Lection10;

public class RenaultEngine extends Engine {
    double extraTurboEnergy;

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public RenaultEngine () {}

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    public double efficiency() {
        return 0.27;
    }

    @Override
    public double throttleEnergy() {
        return engineVolume*cylinderAmount*110+extraTurboEnergy;
    }

    @Override
    public double breakEnergy() {
        return engineWeight*2.1;
    }
}
