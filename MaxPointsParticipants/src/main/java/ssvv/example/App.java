package ssvv.example;

import ssvv.example.view.*;
import ssvv.example.domain.*;
import ssvv.example.repository.*;
import ssvv.example.service.*;
import ssvv.example.validation.*;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();


        StudentXMLRepo fileRepository1 = new StudentXMLRepo( "E:\\Facultate\\Anul_3\\Semestrul1\\PDP\\Project1V2\\MaxPointsParticipants\\fisiere\\Studenti.xml");
        TemaXMLRepo fileRepository2 = new TemaXMLRepo( "E:\\Facultate\\Anul_3\\Semestrul1\\PDP\\Project1V2\\MaxPointsParticipants\\fisiere\\Teme.xml");
        NotaXMLRepo fileRepository3 = new NotaXMLRepo( "E:\\Facultate\\Anul_3\\Semestrul1\\PDP\\Project1V2\\MaxPointsParticipants\\fisiere\\Note.xml");
        NotaValidator notaValidator = new NotaValidator(fileRepository1,fileRepository2);
        Service service = new Service(fileRepository1,studentValidator, fileRepository2,temaValidator, fileRepository3,notaValidator);
        UI consola = new UI(service);
        consola.run();
    }

}
