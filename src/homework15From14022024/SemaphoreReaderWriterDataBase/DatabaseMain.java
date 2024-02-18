package homework15From14022024.SemaphoreReaderWriterDataBase;

/* Задача о читателях и писателях. К базе данных имеют доступ два типа процессов - читатели и
писатели. Первые могут выполнять транзакции, которые могут только читать данные, для вторых
добавляется возможность их читать. Необходимо обеспечить такой доступ к базе данных, что в
любой момент времени в ней находится либо один писатель и ни одного читателя, либо сколь
угодно читателей, но ни одного писателя.
База данных в этом примере условная - ей может выступать какой-то ресурс (массив)*/

public class DatabaseMain {
    public static void main(String[] args) {
        Database database = new Database();
        Reader reader1 = new Reader(database);
        Reader reader2 = new Reader(database);
        Writer writer = new Writer(database, "New Data");

        reader1.start();
        reader2.start();
        writer.start();
    }
}
