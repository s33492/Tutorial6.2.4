class Canine extends Animal {
    private String name;
    private String noise;
    public Canine(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }
    @Override
    public void makeNoise() {
        System.out.println(name + " " + noise );
    }
    @Override
    public void roam() {
        System.out.println( "Canines are roaming");
    }
}
