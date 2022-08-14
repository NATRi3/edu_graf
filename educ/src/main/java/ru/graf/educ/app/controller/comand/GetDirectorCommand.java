package ru.graf.educ.app.controller.comand;

import ru.graf.educ.app.controller.Command;
import ru.graf.educ.app.service.DirectorService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class GetDirectorCommand implements Command {

    private DirectorService directorService;

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        String[] ids = parameterMap.get("id");



        directorService.get(ids[0]);
    }
}
