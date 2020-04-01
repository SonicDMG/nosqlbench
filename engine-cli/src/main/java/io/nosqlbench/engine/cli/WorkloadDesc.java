package io.nosqlbench.engine.cli;

import java.util.List;
import java.util.Set;

public class WorkloadDesc {
    private final String yamlPath;
    private final List<String> scenarioNames;
    private final Set<String> temlpates;

    public WorkloadDesc(String yamlPath, List<String> scenarioNames, Set<String> templates) {
        this.yamlPath = yamlPath;
        this.scenarioNames = scenarioNames;
        this.temlpates = templates;
    }

    public String getYamlPath() {
        return yamlPath;
    }

    public List<String> getScenarioNames() {
        return scenarioNames;
    }

    public Set<String> getTemlpates() {
        return temlpates;
    }
}
