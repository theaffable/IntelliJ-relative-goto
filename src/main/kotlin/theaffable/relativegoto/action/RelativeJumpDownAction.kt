package theaffable.relativegoto.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import theaffable.relativegoto.dialog.RelativeJumpDialog
import theaffable.relativegoto.service.JumpDirection

class RelativeJumpDownAction : AnAction() {
    override fun actionPerformed(p0: AnActionEvent) {
        RelativeJumpDialog(JumpDirection.DOWN).show()
    }
}