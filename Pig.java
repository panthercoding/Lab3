public class Pig{
  /* word in English and corresponding word in PigLatin */
  private String english, pigLatin;

  public Pig(String englishText){   /* constructor method */
    english = englishText;
    pigLatin = translate(englishText);
  }

  public String translate(String englishText){ /* english -> Pig Latin */
    /* missing code */
  }
  public String getEnglish(){ /* accessor method */
    return(english);
  }

  public String getLatin(){ /* accessor method */
    return(pigLatin);
  }
}
