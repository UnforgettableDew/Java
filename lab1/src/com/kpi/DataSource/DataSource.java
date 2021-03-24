package com.kpi.DataSource;

import com.kpi.model.entity.Question;

public class DataSource {
    public static Question[] questions = {
            new Question("Quiz", "Math", "2+2 = ", new String[]{"2","3", "4"}, "4"),
            new Question("Exam", "Math", "24+67 = ", new String[]{"78","91", "81"}, "91"),
            new Question("Unit test", "Geography", "What is the capital of Great Britain?",
                    new String[]{"London","Kiev", "Moscow"}, "London"),
            new Question("Quiz", "English", "Choose the correct form of the word",
                    new String[]{"Mouses","mice", "mices"}, "Mouses"),
            new Question("Quiz", "Geography", "dfsdf", new String[]{"sdf","fff", "hjjj"}, "sdf"),
            new Question("Exam", "Math", "2sdffsg ", new String[]{"gf","ggf", "jjj"}, "jjj"),
            new Question("Quiz", "Geography", "sfgsfg", new String[]{"324","fgg", "kkk"}, "fgg"),
            new Question("Quiz", "Math", "sfgsfg", new String[]{"ffg","fdgdfg", "kkkk"}, "kkkk"),
            new Question("Exam", "English", "sfgfgs", new String[]{"433","sdg", "lkj"}, "433"),
            new Question("Unit test", "Math", "sgffs", new String[]{"sdf","sfgfg", "srt"}, "sfgfg")
    };
}
