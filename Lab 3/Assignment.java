import java.util.ArrayList;
import java.util.Objects;

public class Assignment {
    private ArrayList<String> Evaluation;
    private ArrayList<String> SR;
    private ArrayList<String> Result;
    private boolean done;

    public Assignment() {
        this.Evaluation = new ArrayList<>();
        this.SR = new ArrayList<>();
        this.Result = new ArrayList<>();
        this.done = false;
    }

    public void addEvaluation(String oz){
        this.Evaluation.add(oz);
    }

    public void addSR(String sr){
        this.SR.add(sr);
    }

    public void addResult(String res){
       this.Result.add(res);
    }

   public void complete(){
      this.done = true;
   }

    @Override
    public String toString() {
        return  ",\n" +
                "Оценки " + Evaluation +
                ", Средний бал =" + SR +
                ", Решение: " + Result

                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return done == that.done && Objects.equals(Evaluation, that.Evaluation) && Objects.equals(SR, that.SR) && Objects.equals(Result, that.Result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Evaluation,SR, Result, done);
        //drugs, surgeries, done
    }
}

