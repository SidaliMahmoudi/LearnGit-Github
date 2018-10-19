public class Person{
private String first_name, last_name, address, phone_number;
private Date birth_date;

public Person(){}

public Person(String fn, String ln, String ad, String pn, Date bd)
{
first_name = fn;
last_name = ln;
address = ad;
phone_number = ph;
birth_date = bd;
}

public Person(String fn, String ln, Date bd)
{
first_name = fn;
last_name = ln;
birth_date = bd;
}
}
