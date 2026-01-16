package src;

import src.*;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Faculty csf = new Faculty("Security Experiments faculty");
        Institute infSysInTeleCom = new Institute("Voronezh State University", "Voronezh, Universitetskaya ploschad, 1");
        Lecturer lecturer = new Lecturer(1, "Ivanov Timofey", "tilt_alive@gmail.com", "Internet AnaLise");
        Project ai_research = new Project("Binary Chanell", new Date(2025, 11, 1), new Date(2026, 5, 1));
        Participation participation = new Participation(50, ai_research, lecturer);
        Course ml = new Course("Security", 1, 250);
        csf.addInstitute(infSysInTeleCom);
        infSysInTeleCom.addResearchAssociate(lecturer);
        lecturer.addParticipation(participation);
        ai_research.addParticipation(participation);
        lecturer.addCourse(ml);
        ml.addLecturer(lecturer);

        System.out.println("Факультет: "
                + csf.getName()
        );
        System.out.println("Институты: "
                + Arrays.stream(csf.getInstitutes())
                .filter(Objects::nonNull)
                .map(Institute::getName)
                .collect(Collectors.joining(", "))
        );
        System.out.println("Сотрудники института: "
                + Arrays.stream(infSysInTeleCom.getResearchAssociates())
                .filter(Objects::nonNull)
                .map(ResearchAssociate::getName)
                .collect(Collectors.joining(", "))
        );
        System.out.println("Проекты Тимофея: "
                + Arrays.stream(lecturer.getParticipations())
                .filter(Objects::nonNull)
                .map(Participation::getProject)
                .map(Project::getName)
                .collect(Collectors.joining(", "))
        );
        System.out.println("Курсы: "
                + ml.getName()
        );
        System.out.println("Информация о курсе: \n"
                + "название: " + ml.getName()
                + "\nкол-во часов: " + ml.getHours()
                + "\nid курса: " + ml.getId()
                + "\nпреподаватели: " + Arrays.stream(ml.getLecturers())
                .filter(Objects::nonNull)
                .map(Lecturer::getName)
                .collect(Collectors.joining(", "))
        );
    }
}