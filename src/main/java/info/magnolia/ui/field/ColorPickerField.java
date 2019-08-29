package info.magnolia.ui.field;

import com.vaadin.ui.Component;
import com.vaadin.v7.shared.ui.colorpicker.Color;
import com.vaadin.v7.ui.ColorPicker;
import com.vaadin.v7.ui.CustomField;

/**
 * ColorPickerField creates (and sets) the Vaadin ColorPicker component.
 * 
 * @author rgange - Magnolia International
 */
public class ColorPickerField extends CustomField<Integer> {

    private final ColorPicker colorPicker;

    public ColorPickerField() {
        colorPicker = new ColorPicker();
    }

    public ColorPickerField(int rgb) {
        colorPicker = new ColorPicker();
        colorPicker.setColor(new Color(rgb));
    }

    public void setColor(int rgb) {
        colorPicker.setColor(new Color(rgb));
    }

    @Override
    protected Component initContent() {
        colorPicker.addColorChangeListener(event -> setValue(event.getColor().getRGB()));
        return colorPicker;
    }

    @Override
    public Class<? extends Integer> getType() {
         return Integer.class;
    }
}
