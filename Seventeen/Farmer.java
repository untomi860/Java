class Farmer extends Colleague 
{
    public Farmer(Mediator mediator) {
        super(mediator);
}
    
    /*public void growTomato() {
        String tomato = "Tomato";
        System.out.println(this.getClass().getSimpleName() + " raised " + tomato);
        mediator.Send(tomato, this);
    }*/
}