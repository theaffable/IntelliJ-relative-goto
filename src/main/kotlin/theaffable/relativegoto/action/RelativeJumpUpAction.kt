package theaffable.relativegoto.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import theaffable.relativegoto.dialog.RelativeJumpDialog
import theaffable.relativegoto.service.JumpDirection
import theaffable.relativegoto.service.JumpService

class RelativeJumpUpAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        RelativeJumpDialog(
            direction = JumpDirection.UP,
            jumpService = JumpService(e.getData(CommonDataKeys.EDITOR)!!)
        ).show()
    }
}