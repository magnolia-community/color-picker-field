package info.magnolia.ui.field;

import com.vaadin.ui.Component;
import com.vaadin.shared.ui.colorpicker.Color;
import com.vaadin.ui.ColorPicker;
import com.vaadin.ui.CustomField;

/**
 * ColorPickerField creates (and sets) the Vaadin ColorPicker component.
 * 
 * @author rgange - Magnolia International
 */
public class ColorPickerField extends CustomField<Integer> {

    private final ColorPicker colorPicker;

    public ColorPickerField() {
        colorPicker = new ColorPicker();
        colorPicker.setModal(true);
    }

    @Override
    protected void doSetValue(Integer value) {
        if(value!= null) {
            colorPicker.setValue(new Color(value));
        }
    }

    @Override
    protected Component initContent() {
        colorPicker.addValueChangeListener(event -> setValue(event.getValue().getRGB()));
        return colorPicker;
    }

    @Override
    public Integer getValue() {
        return this.colorPicker.getValue().getRGB();
    }
}
