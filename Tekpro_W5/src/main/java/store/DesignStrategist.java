package store;

public class DesignStrategist extends AbstractStoreEmployee {
    private double designBonusRate;
    private int projectsCompleted;
    private double creativity;

    public DesignStrategist(int projectsCompleted, double numberOfHoursWorked,
                            double hourlyRate, String storeDetails,
                            double basePay, String name) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, name);
        this.projectsCompleted = projectsCompleted;
        this.creativity = 0;
        this.designBonusRate = 0;
    }

    @Override
    public double calculatePay() {
        if (projectsCompleted > 10) {
            designBonusRate = 5.00;
        } else if (projectsCompleted > 5 && projectsCompleted <= 10) {
            designBonusRate = 3.00;
        } else {
            designBonusRate = 1;
        }

        return (super.getNumberOfHoursWorked() * super.getHourlyRate()
                + super.getBasePay() * (1 + designBonusRate / 100));
    }

    @Override
    public boolean checkPromotionEligibility() {
        if (calculatePay() > 60000.0) {
            return true;
        } else {
            return false;
        }
    }

    public double getDesignBonusRate() {
        return designBonusRate / 100;
    }

    public double getProjectsCompleted() {
        return projectsCompleted;
    }

    public void setDesignBonusRate(double designBonusRate) {
        this.designBonusRate = designBonusRate;
    }

    public void setProjectsCompleted(int projectsCompleted) {
        this.projectsCompleted = projectsCompleted;
    }

    public double getCreative(){
        if (projectsCompleted > 10) {
            creativity = 10.00;
        } else if (projectsCompleted > 5 && projectsCompleted <= 10) {
            creativity = 5.00;
        } else {
            creativity = 1;
        }

        return creativity * 10;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Creative Skill: " + getCreative() + "%";
    }
    
    @Override
    public String evaluatePerformance() {
        if(getNumberOfHoursWorked() > 20 && projectsCompleted > 10){
            return super.employeeName + " stands as a visionary genius.";
        }else if(getNumberOfHoursWorked() > 15 && (projectsCompleted > 5 && projectsCompleted <= 10)){
            return super.employeeName + " showcases profound crativity.";
        }else{
            return super.employeeName + " needs improvement.";
        }
    }
    
    @Override
    public boolean isTired(){
        if(getNumberOfHoursWorked() > 20){
            return true;
        }else{
            return false;
        }
    }
}
