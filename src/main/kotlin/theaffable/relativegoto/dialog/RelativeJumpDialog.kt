package theaffable.relativegoto.dialog

import com.intellij.openapi.ui.DialogWrapper
import java.awt.BorderLayout
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

class RelativeJumpDialog : DialogWrapper(false) {
    private val textField by lazy {
        createInputComponent()
    }

    init {
        title = "Go To Relative Line"
        init()
    }

    override fun createCenterPanel(): JComponent {
        val dialogPanel = JPanel(BorderLayout())

        val label = JLabel("Line ")
        dialogPanel.add(label, BorderLayout.WEST)
        dialogPanel.add(textField, BorderLayout.CENTER)

        return dialogPanel
    }

    private fun createInputComponent() = JTextField(1)

    override fun getPreferredFocusedComponent(): JComponent = textField

    override fun doOKAction() {
        super.doOKAction()
    }
}