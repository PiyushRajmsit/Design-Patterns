package com.designPatterns.creationalPatterns.builderPattern;

public class House {
    private String name;
    private Integer area;
    private Integer price;

    private House(HouseBuilder houseBuilder){
        this.name = houseBuilder.name;
        this.area = houseBuilder.area;
        this.price = houseBuilder.price;
    }

    public void printHouse(){
        System.out.println(this.name + " is Priced at " + this.price + " and have an area of " + this.area);
        return;
    }

    public static class HouseBuilder{

        private String name;
        private Integer area;
        private Integer price;

        public HouseBuilder setName(String name){
            this.name = name;
            return this;
        }

        public HouseBuilder setArea(Integer area){
            this.area = area;
            return this;
        }

        public HouseBuilder setPrice(Integer price){
            this.price = price;
            return this;
        }
        public HouseBuilder() {
        }

        public House build(){
            House house = new House(this);
            return house;
        }

    }

    public static void main(String args[]){

        House house = new House.HouseBuilder().setName("MyHouse").setArea(10).setPrice(100).build();
        house.printHouse();
    }


}
