import org.junit.jupiter.api.Test;


public class RegistrationForm extends BaseTest {


    @Test
    public void setName(){
      practiceFormPage.setName("Seher");

    }
    @Test
    public void setLastName(){
        practiceFormPage.setLastName("Bos");

    }
    @Test
    public void setEmail(){
        practiceFormPage.setEmail("sbos@hotmail.com");

    }

}
