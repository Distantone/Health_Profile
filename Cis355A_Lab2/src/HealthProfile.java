
/**
 *
 * @author Payden Boughton
 */
public class HealthProfile {
    
    private String Name;
    private float age, weight, height;
    
    
    public HealthProfile()
    {
        Name = null;
        age = weight = height = 0;
    }

    public HealthProfile(String Name, int age, float weight, float height) {
        this.Name = Name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    public HealthProfile(String Name, int age, float weight, int height_feet, float height_inches) {
        this.Name = Name;
        this.age = age;
        this.weight = weight;
        this.setHeight(height_feet, height_inches);
    }

    
    
    //setters
    public void setName(String name)
    {
        Name = name;
        
    }
    public void setAge(float age)
    {
        age = age;
        
    }
    public void setWeight(float weigh)
    {
        
        weight = weigh;
    }
    public void setHeight(float heightFt, float heightIn)
    {
        this.height = (heightFt * 12) + heightIn;
    }
    
    //getters
    public String getName()
    {
        return Name;
    }
    public Float getAge()
    {
        return age;
    }
    public Float getWeight()
    {
        return weight;
    }
    public Float getHeight()
    {
        //this.height = (heightFt * 12) + heightIn;
        return height;
    }
    
    //calculate BMI
    public float calcBMI()
    {
        float bmi;
        bmi =  (weight * 703) / (float)Math.pow(height,2);
        return bmi;

    }
    //put into Category
    public String calcCategory()
    {
        
        float bmi = calcBMI();
        
        //debug
       // System.out.println("TEST TEST TEST" + weigh);
       // System.out.println("TEST TEST TEST" + heigh);
       //System.out.println("TEST TEST TEST" + BMI);
        
        if (bmi >= 30f)
        {
            return "Obese";
        }
        else if (bmi >= 18.5f && bmi <= 24.9f)
        {
            return "Normal"; 
        }
        else if (bmi >= 25f && bmi <= 29.9f)
        {
            return "Overweight";
        }
        else if (bmi < 18.5f)
        {
            return "Underweight";
        }
        return null;
        
    }
    //calculate Max Heart Rate
    public float calcMaxHR()
    {
        float hr;
        //calculating heart rate
        hr = 220 - age;
        return hr;
    }
    
}

