package theaffable.relativegoto.service

import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.LogicalPosition

class JumpService(private val editor: Editor) {
    fun goToLine(relativeLine: Int) {
        val currentLine = editor.document.getLineNumber(editor.caretModel.primaryCaret.offset)
        val targetAbsoluteLine = (currentLine + relativeLine).coerceIn(0..editor.document.lineCount)
        editor.caretModel.primaryCaret.moveToLogicalPosition(LogicalPosition(targetAbsoluteLine, 0))
    }
}