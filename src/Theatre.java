import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Алексей", "Кругов", Gender.MALE, 180);
        Actor actor2 = new Actor("Иван", "Зайцев", Gender.MALE, 175);
        Actor actor3 = new Actor("Анна", "Борина", Gender.FEMALE, 158);

        Director director1 = new Director("Дмитрий","Дьяченко",Gender.MALE, 3);
        Director director2 = new Director("Тимур","Бекмамбетов",Gender.MALE, 2);

        Person musicAuthor = new Person("ИмяМузыка", "ФамилияМузыка", Gender.MALE);
        Person choreographer = new Person("ИмяХореограф", "ФамилияХореограф", Gender.MALE);

        String librettoBallet = "Действие 1. Лесная поляна.Утро. На волшебной поляне просыпаются маленькие эльфы и начинают танцевать (легкий, быстрый танец). Появляется Злая Тучка, она завидует красоте цветов и заколдовывает Главный Цветок — он засыпает, а его лепестки тускнеют. Лесные жители грустят, их движения становятся медленными и плавно-печальными.Действие 2. Лунный луч.Ночь. Прилетает Добрая Фея Луны. Она видит спящий цветок и решает спасти его. Фея исполняет сольный танец (адажио) с серебряной лентой, символизирующей лунный свет. Она касается цветка волшебной палочкой.Действие 3. Праздник пробуждения.Лучи солнца касаются земли. Цветок медленно раскрывается, его лепестки ярко сияют. Все эльфы и цветы возвращаются на поляну и празднуют победу света радостным, общим танцем (финал).";
        String librettoOpera = "Земля устала, ночь идет,И старый клен листву роняет.Никто сюда уже не придет,И только дождь меня опекает.(Из-за кустов появляется Девочка Майя. Она испуганно оглядывается, в руках у нее потухший бумажный фонарик.)Речитатив МайиЯ шла на свет, но свет погас...Скажите, дедушка, где я?Вокруг темно уже в который раз,И затерялась тропка моя.";

        Show show = new Show();
        show.title = "Обычный спектакль";

        Opera opera = new Opera("Жизнь за царя", 150, director2, musicAuthor,
                librettoOpera,4);
        Ballet ballet = new Ballet("Лебединое озеро", 200, director1, musicAuthor,
                librettoBallet, choreographer);

        System.out.println("Режиссер оперы:");
        opera.getDirector();

        show.newActor(actor1);
        show.newActor(actor3);
        show.newActor(actor3);

        opera.newActor(actor1);
        opera.newActor(actor2);
        opera.newActor(actor3);

        ballet.newActor(actor1);
        ballet.newActor(actor2);

        show.getAllActors();
        opera.getAllActors();
        ballet.getAllActors();

        ballet.changeActor(actor3, "Зайцев");
        ballet.getAllActors();

        opera.changeActor(actor1, "Васильев");

        System.out.println("Либретто Оперы:");
        opera.getLibrettoText();

        System.out.println("Либретто Баллета:");
        ballet.getLibrettoText();

    }
}
