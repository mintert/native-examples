require 'ffi'

module Win
  extend FFI::Library

  ffi_lib 'user32'

  attach_function :message_box, :MessageBoxA,
                  [:pointer, :buffer_in, :buffer_in, :int], :int
end

Win.message_box(nil, 'Hello World!', 'Titel', 0)
