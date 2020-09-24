package info.magnolia.ui.field;

import com.vaadin.ui.Component;

import info.magnolia.objectfactory.ComponentProvider;
import info.magnolia.ui.field.factory.AbstractFieldFactory;

/**
 * ColorPickerFieldFactory is responsible for creating the ColorPickerField.
 * 
 * @author rgange - Magnolia International
 */
public class ColorPickerFieldFactory extends AbstractFieldFactory<Integer, ColorPickerFieldDefinition> {

    public ColorPickerFieldFactory(ColorPickerFieldDefinition definition, ComponentProvider componentProvider) {
        super(definition, componentProvider);
    }

    @Override
    protected Component createFieldComponent() {
        return new ColorPickerField();
    }
}