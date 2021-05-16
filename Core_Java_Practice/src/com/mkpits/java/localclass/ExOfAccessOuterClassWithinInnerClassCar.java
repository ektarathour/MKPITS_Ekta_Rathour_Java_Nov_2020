//A program of Accessing Members of Outer Class within Inner Class
package com.mkpits.java.localclass;

 class ExOfAccessOuterClassWithinInnerClassCar {

        String carName;
        String carType;

        // assign values using constructor
        public ExOfAccessOuterClassWithinInnerClassCar(String name, String type) {
            this.carName = name;
            this.carType = type;
        }

        // private method
        private String getCarName() {
            return this.carName;
        }

        // inner class
        class Engine {
            String engineType;
            void setEngine() {

                // Accessing the carType property of Car
                if(ExOfAccessOuterClassWithinInnerClassCar.this.carType.equals("4WD")){

                    // Invoking method getCarName() of Car
                    if(ExOfAccessOuterClassWithinInnerClassCar.this.getCarName().equals("Crysler")) {
                        this.engineType = "Smaller";
                    } else {
                        this.engineType = "Bigger";
                    }

                }else{
                    this.engineType = "Bigger";
                }
            }
            String getEngineType(){
                return this.engineType;
            }
        }
    }

    class MainClassCar {
        public static void main(String[] args) {

// create an object of the outer class Car
            ExOfAccessOuterClassWithinInnerClassCar car1 =
                    new ExOfAccessOuterClassWithinInnerClassCar("Mazda", "8WD");

            // create an object of inner class using the outer class
            ExOfAccessOuterClassWithinInnerClassCar.Engine engine =
                    car1.new Engine();
            engine.setEngine();
            System.out.println("Engine Type for 8WD= " + engine.getEngineType());

            ExOfAccessOuterClassWithinInnerClassCar car2 =
                    new ExOfAccessOuterClassWithinInnerClassCar("Crysler", "4WD");
            ExOfAccessOuterClassWithinInnerClassCar.Engine c2engine = car2.new Engine();
            c2engine.setEngine();
            System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
        }
    }

