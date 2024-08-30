package org.example.faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class DataFaker {
    private static final Random random = new Random();
    private static final List<String> NAMES = List.of(
            "Анна Иванова", "Иван Петров", "Мария Сидорова", "Петр Козлов", "Елена Николаева", "Александр Иванов", "Ольга Петрова", "Дмитрий Смирнов", "Татьяна Кузнецова", "Сергей Попов", "Екатерина Морозова", "Николай Васильев", "Анастасия Петрова", "Алексей Соколов", "Юлия Иванова", "Константин Лебедев", "Виктория Козлова", "Игорь Павлов", "Светлана Семенова", "Артем Иванов", "Евгения Федорова", "Максим Александров", "Людмила Егорова", "Георгий Дмитриев", "Надежда Кузнецова", "Владимир Петров", "Евгений Сергеев", "Наталья Иванова", "Илья Михайлов", "Елизавета Смирнова", "Артур Кузнецов", "Валентина Попова", "Денис Иванов", "Вера Петрова", "Владислав Соколов", "Лариса Иванова", "Андрей Петров", "Марина Сидорова", "Павел Козлов", "Оксана Николаева", "Станислав Васильев", "Раиса Петрова", "Борис Иванов", "Маргарита Смирнова", "Григорий Дмитриев", "Любовь Кузнецова", "Роман Попов", "Эльвира Иванова", "Кирилл Михайлов", "Зинаида Соколова", "Семен Петров", "Роза Николаева", "Федор Сергеев", "Регина Иванова", "Василий Петров", "Валерия Козлова", "Геннадий Васильев", "Дарья Петрова", "Егор Соколов", "София Иванова", "Тимофей Попов", "Ирина Смирнова", "Владислава Кузнецова", "Михаил Иванов", "Тамара Петрова", "Ильяс Сергеев", "Элина Иванова", "Рустам Попов", "Лилия Николаева", "Герман Васильев", "Анжелика Петрова", "Руслана Козлова"
    );

    private static final List<String> EMAILS = List.of("anna.ivanova@example.com", "ivan.petrov@example.com", "maria.sidorova@example.com", "petr.kozlov@example.com", "elena.nikolaeva@example.com", "alexander.ivanov@example.com", "olga.petrova@example.com", "dmitry.smirnov@example.com", "tatiana.kuznetsova@example.com", "sergey.popov@example.com", "ekaterina.morozova@example.com", "nikolai.vasiliev@example.com", "anastasia.petrova@example.com", "alexei.sokolov@example.com", "yulia.ivanova@example.com", "konstantin.lebedev@example.com", "victoria.kozlova@example.com", "igor.pavlov@example.com", "svetlana.semenova@example.com", "artem.ivanov@example.com", "evgenia.fedorova@example.com", "maxim.alexandrov@example.com", "lyudmila.yegorova@example.com", "georgiy.dmitriev@example.com", "nadezhda.kuznetsova@example.com", "vladimir.petrov@example.com", "evgeny.sergeev@example.com", "natalia.ivanova@example.com", "ilya.mikhailov@example.com", "elizaveta.smirnova@example.com", "artur.kuznetsov@example.com", "valentina.popova@example.com", "denis.ivanov@example.com", "vera.petrova@example.com", "vladislav.sokolov@example.com", "larisa.ivanova@example.com", "andrey.petrov@example.com", "marina.sidorova@example.com", "pavel.kozlov@example.com", "oksana.nikolaeva@example.com", "stanislav.vasiliev@example.com", "raisa.petrova@example.com", "boris.ivanov@example.com", "margarita.smirnova@example.com", "grigory.dmitriev@example.com", "lyubov.kuznetsova@example.com", "roman.popov@example.com", "elvira.ivanova@example.com", "kirill.mikhailov@example.com", "zinaida.sokolova@example.com", "semen.petrov@example.com", "rosa.nikolaeva@example.com", "fedor.sergeev@example.com", "regina.ivanova@example.com", "vasily.petrov@example.com", "valeria.kozlova@example.com", "gennady.vasiliev@example.com", "daria.petrova@example.com", "egor.sokolov@example.com", "sofia.ivanova@example.com", "timofey.popov@example.com", "irina.smirnova@example.com", "vladislava.kuznetsova@example.com", "mikhail.ivanov@example.com", "tamara.petrova@example.com", "ilyas.sergeev@example.com", "elina.ivanova@example.com", "rustam.popov@example.com", "liliya.nikolaeva@example.com", "german.vasiliev@example.com", "angelica.petrova@example.com", "ruslana.kozlova@example.com");
    private static final List<String> passwords = List.of("123456", "qwerty", "password", "123abc", "letmein", "111111", "admin1", "welcome", "sunshine", "123456789", "abc123", "password1", "12345", "iloveyou", "1234qwer", "qwerty123", "password123", "123qwe", "1234abcd", "pass123", "1234qwer", "qazwsx", "987654", "1qaz2wsx", "asdfgh", "zxcvbn", "dragon", "football", "baseball", "master", "superman", "batman", "spiderman", "mustang", "corvette", "letsgo", "hello1", "goodbye", "sunset", "moonlight", "starlight", "fireworks", "summer1", "winter1", "spring1", "autumn1");
    private static final List<String> links = List.of("C:/Users", "C:/Program Files", "C:/Windows", "C:/ProgramData", "C:/Documents and Settings", "C:/Program Files (x86)", "C:/Temp", "C:/Downloads", "C:/Pictures", "C:/Music", "C:/Videos", "C:/Games", "C:/Backup", "C:/Logs", "C:/Projects", "C:/Desktop", "C:/Documents", "C:/System", "C:/Drivers", "C:/Tools");
    private static final List<String> comments = List.of("Увлекательно", "Захватывающе", "Интересно", "Загадочно", "Смешно", "Драматично", "Романтично", "Трогательно", "Эмоционально", "Забавно", "Невероятно", "Фантастично", "Завораживающе", "Пугающе", "Волнующе", "Загадочно", "Динамично", "Вдохновляюще", "Мистически", "Смутно", "Остро", "Ярко", "Безумно", "Пронзительно", "Эпично", "Уморительно", "Очаровательно", "Жутковато", "Сверхъестественно", "Подвижно", "Печально", "Замысловато", "Весело", "Грустно", "Таинственно", "Завораживающе", "Философски", "Искренне", "Проникновенно", "Потрясающе", "Игриво", "Нежно", "Героически", "Великолепно", "Коварно", "Сложно", "Дерзко", "Легко", "Бурно", "Мрачно", "Светло", "Подвиги", "Чудеса", "Подлости", "Страсти", "Возмущения", "Катастрофы", "Разочарования", "Успехи", "Провалы", "Смелость", "Страхи", "Любовь",
            "Ревность",
            "Предательство",
            "Дружба",
            "Вражда",
            "Победы",
            "Поражения",
            "Счастье",
            "Горе",
            "Испытания",
            "Открытия",
            "Тайны",
            "Борьба",
            "Мир",
            "Война",
            "Жизнь",
            "Смерть",
            "Надежда",
            "Отчаяние",
            "Истина",
            "Ложь",
            "Разум",
            "Чувства",
            "Судьба",
            "Свобода",
            "Цепи",
            "Справедливость",
            "Правда",
            "Обман",
            "Компромисс",
            "Жертва",
            "Эгоизм",
            "Добро",
            "Зло",
            "Любопытство",
            "Страсть",
            "Разумение",
            "Непонимание",
            "Вера",
            "Сомнение",
            "Уверенность",
            "Скромность",
            "Гордость",
            "Смирение",
            "Амбиции",
            "Безнадежность");

    public static final List<String> tagAndType = List.of("Школьная жизнь", "Романтика", "Фэнтези", "Драма", "Комедия", "Экшн", "Сверхъестественное", "Приключения", "Мистика", "Исторический", "Научная фантастика", "Гарем", "Сёнэн", "Сёдзё", "Сэйнэн", "Дзёсэй", "Хентай", "Психология", "Трагедия", "Спорт", "Гендерная интрига", "Боевик", "Меха", "Игры", "Хоррор", "Повседневность", "Реборн", "Вампиры", "Триллер", "Изоляция", "Философия", "Искусство", "Магия", "Роботы", "Цветастые образы", "Шизофрения", "Музыка", "Сверхспособности", "Загадки", "Космос", "Дружба", "Вражда", "Любовь", "Битва за выживание", "Охота на чудовище", "Жестокость", "Кровь и насилие", "Подростковые проблемы", "Путешествие в прошлое/будущее", "Политические интриги", "Обмен телами", "Семейные отношения");
    public static String getName() {
        return NAMES.get(random.nextInt(NAMES.size() - 2));
    }

    public static String getEmail() {
        return EMAILS.get(random.nextInt( EMAILS.size() - 2));
    }

    public static String getPassword() {
        return passwords.get(random.nextInt( passwords.size() - 2));
    }

    public static String getLink(){
        return links.get(random.nextInt( links.size() - 2));
    }

    public static String getComments() {
        return comments.get(random.nextInt( comments.size() - 2));
    }

    public static String getTagOrType() {
        return tagAndType.get(random.nextInt( tagAndType.size() - 2));
    }
}
