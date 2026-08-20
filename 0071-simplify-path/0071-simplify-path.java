class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

        String result = "";

        for (String folder : stack) {
            result += "/" + folder;
        }

        return result.isEmpty() ? "/" : result;
    }
}

// . Current directory mein hi raho.
// .. Parent directory mein jao.