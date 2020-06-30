public class Narzedzia_Informatyki
{
    public static void main(String[] args)
    {
        class ToOsoba {
            public String imie, nazwisko;
            public int wiek;

            ToOsoba() {
                System.out.println("Ustawiam wartości domyślne klasy Osoba.");
                this.imie = "Jan";
                this.nazwisko = "Kowalski";
                this.wiek = 23;
            }

            String wyswietl() {
                System.out.println("Imię: " + imie);
                System.out.println("Nazwisko: " + nazwisko);
                System.out.println("Wiek: " + wiek);
                return null;
            }

            String PodajImie() {
                return imie;
            }

            String PodajNazwisko() {
                return nazwisko;
            }
        }

        class ToStudent extends ToOsoba
        {
            String kierunek;
            int rok;
            ToStudent()
            {
                System.out.println("Ustawiam wartości domyślne klasy Student.");
                imie = "Andrzej";
                nazwisko = "Nogalski";
                wiek = 19;
                kierunek = "Informatyka";
                rok = 2;
            }
        }

        System.out.println();
        System.out.println("TEST");
        ToOsoba J = new ToOsoba();
        J.wyswietl();
        System.out.println();
        ToStudent S = new ToStudent();
        S.wyswietl();
        System.out.println();
        J.wyswietl();
        S.wyswietl();
        System.out.println(J.PodajImie());
        System.out.println(S.PodajImie());
    }
}
