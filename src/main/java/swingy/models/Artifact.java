package swingy.models;

import lombok.Data;
import swingy.models.enums.ArtifactType;

@Data
public class Artifact {
    private ArtifactType type;
    private int bonus;
}
