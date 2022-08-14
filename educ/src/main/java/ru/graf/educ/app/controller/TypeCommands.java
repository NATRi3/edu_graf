package ru.graf.educ.app.controller;

import ru.graf.educ.app.controller.comand.GetDirectorCommand;

public enum TypeCommands {
    GET_DIRECTOR(new GetDirectorCommand()),
    CREATE_DIRECTOR(),
    UPDATE_DIRECTOR();

    private Command command;

    TypeCommands(Command command) {
        this.command = command;
    }
}
