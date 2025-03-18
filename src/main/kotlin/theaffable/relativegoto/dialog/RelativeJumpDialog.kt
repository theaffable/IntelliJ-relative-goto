package theaffable.relativegoto.dialog

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.openapi.ui.ValidationInfo
import java.awt.BorderLayout
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import theaffable.relativegoto.service.JumpDirection
import theaffable.relativegoto.service.JumpService

class RelativeJumpDialog(
    private val direction: JumpDirection,
    private val jumpService: JumpService
) : DialogWrapper(false) {
    private val textField by lazy {
        createInputComponent()
    }

    init {
        title = "Go ${direction.name.lowercase()}"
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
        val sign = if (direction == JumpDirection.UP) -1 else 1
        jumpService.goToLine(textField.text.toInt() * sign)
        close(OK_EXIT_CODE)
    }

    override fun doValidate(): ValidationInfo? {
        return if (textField.text.toIntOrNull() == null) ValidationInfo("Text must be a number") else null
    }
}