
    public class SimpleCalculator {

        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber(){
            return this.firstNumber;
        }
        public double getSecondNumber(){
            return this.secondNumber;
        }
        public void setFirstNumber(double n){
            this.firstNumber = n;
        }
        public void setSecondNumber(double n){
            this.secondNumber = n;
        }
        public double getAdditionResult(){
            return this.firstNumber + this.secondNumber;
        }
        public double getSubtractionResult(){
            return this.firstNumber - this.secondNumber;
        }
        public double getMultiplicationResult(){
            return this.firstNumber * this.secondNumber;
        }
        public double getDivisionResult(){
            if(secondNumber == 0){
                return 0;
            }else{
                return this.firstNumber / this.secondNumber;
            }
        }

    }
