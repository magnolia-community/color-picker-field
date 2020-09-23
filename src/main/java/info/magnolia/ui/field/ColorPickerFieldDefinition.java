package info.magnolia.ui.field;

/**
 * Definition class for configuration options of the {#link {@link ColorPickerField}.
 * 
 * @author rgange - Magnolia International
 */
@FieldType("colorPickerField")
public class ColorPickerFieldDefinition extends ConfiguredFieldDefinition<Integer> {

    public ColorPickerFieldDefinition() {
        setType(Integer.class);
        setFactoryClass(ColorPickerFieldFactory.class);
    }
}
