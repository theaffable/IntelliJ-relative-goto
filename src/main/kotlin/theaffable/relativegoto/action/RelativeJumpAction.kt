package theaffable.relativegoto.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class RelativeJumpAction : AnAction() {
    override fun actionPerformed(p0: AnActionEvent) {
        Messages.showMessageDialog("This is a test message", "Title", Messages.getInformationIcon())
    }
}