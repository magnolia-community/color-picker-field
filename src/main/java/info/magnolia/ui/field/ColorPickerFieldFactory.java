package info.magnolia.ui.field;

import javax.inject.Inject;

import com.vaadin.v7.data.Item;
import com.vaadin.v7.ui.Field;

import info.magnolia.ui.form.field.factory.AbstractFieldFactory;


/**
 * ColorPickerFieldFactory is responsible for creating the ColorPickerField.
 * 
 * @author rgange - Magnolia International
 */
public class ColorPickerFieldFactory extends AbstractFieldFactory<ColorPickerFieldDefinition, Integer> {
    
    private final ColorPickerField cpf;
    
    @Inject
    public ColorPickerFieldFactory(ColorPickerFieldDefinition definition, Item relatedFieldItem) {
        super(definition, relatedFieldItem);
        
        if (relatedFieldItem.getItemProperty("color") != null) {
            Long value = (Long) relatedFieldItem.getItemProperty("color").getValue();
            cpf = new ColorPickerField(value.intValue());
        }
        else cpf = new ColorPickerField();
    }

    @Override
    protected Field<Integer> createFieldComponent() {
        return cpf;
    }
    
    @Override
    protected Class<?> getDefaultFieldType() {
        return Integer.class;
    }
}