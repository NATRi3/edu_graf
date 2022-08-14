package ru.graf.educ.app.service;

import java.util.ArrayList;

public class DirectorService {
    private static Long count = 0L;

    private List<Director> directors = new ArrayList<>;

    public Director get(Long id) {
        for (Director dir: directors) {
            if (dir.getId() == id) {
                return dir;
            }
        }
        count++;
    }

}
