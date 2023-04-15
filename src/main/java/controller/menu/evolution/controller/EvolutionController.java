package controller.menu.evolution.controller;

import controller.menu.evolution.service.EvolutionServiceLogic;
import controller.menu.evolution.view.InputView;
import controller.menu.evolution.view.OutputView;

public class EvolutionController {
    private final OutputView outputView;
    private final InputView inputView;
    private EvolutionServiceLogic evolutionServiceLogic;
    private final String EVOLUTION_LIST = "1";
    private final String EVOLUTION = "2";
    private final String EXIT = "0";

    public EvolutionController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    public void start() {
        outputView.welcome();

        while (true) {
            this.evolutionServiceLogic = new EvolutionServiceLogic();

            outputView.menu();
            String input = inputView.menu();

            switch (input) {
                case EVOLUTION_LIST:
                    String evolutionList = evolutionServiceLogic.evolutionList();
                    outputView.evolutionList(evolutionList);
                    break;
                case EVOLUTION:
                    if (!evolutionServiceLogic.checkEvolution()) {
                        outputView.notEvolution();
                        return;
                    }

                    outputView.evolution();
                    String pokemonName = inputView.evolution(evolutionServiceLogic.getNames());
                    evolutionServiceLogic.evolution(pokemonName);
                    outputView.successEvolution();
                    break;
                case EXIT:
                    return;

            }
        }
    }

}
