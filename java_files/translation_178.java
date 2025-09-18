public void close() throws IOException {
    if (isOpen) {
        isOpen = false;
        try {
            dump();
        }
        finally {
            try {
                channel.close();
            }
            finally {
                try {
                    channel = null;
                }
                finally {
                    if (out != null) {
                        out.close();
                    }
                    else {
                        out = new ByteArrayOutputStream();
                    }
                }
            }
        }
    }